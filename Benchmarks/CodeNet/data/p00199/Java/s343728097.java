import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			LinkedList<String> list = new LinkedList<String>();
			list.clear();
			for(int i = 0; ; i++)
			{
				String s = in.readLine();
				if(s != null && !s.equals("0 0"))
				{
					list.add(s);
				} else
				{
					break;
				}
			}
			LinkedList<String> answers = new LinkedList<String>();
			String reg = null;
			int[] chair = null;
			for(String str : list)
			{
				if((new StringTokenizer(str)).countTokens() == 2)
				{
					if(reg != null)
					{
						answers.add(reg);
					}
					chair = getChair(str);
				} else
				{
					chair = moveChair(chair, str);
					reg = getChairsString(chair);
				}
			}
			answers.add(reg);
			for(String s : answers)
			{
				System.out.println(s);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static String getChairsString(int[] chair)
	{
		String s = "";
		for(int i = 0; i < chair.length; i++)
		{
			int j = chair[i];
			s += j == 0 ? "#" : j == 1 ? "A" : j == 2 ? "B" : j == 3 ? "C" : j == 4 ? "D" : "_";
		}
		return s;
	}

	private static int[] moveChair(int[] chair, String str)
	{
		if(str.equals("A"))
		{
			return moveA(chair);
		} else
		if(str.equals("B"))
		{
			return moveB(chair);
		} else
		if(str.equals("C"))
		{
			return moveC(chair);
		} else
		if(str.equals("D"))
		{
			return moveD(chair);
		} else
		{
			return null;
		}
	}

	private static int[] moveA(int[] chair)
	{
		for(int i = 0; i < chair.length; i++)
		{
			if(chair[i] == 0)
			{
				chair[i] = 1;
				return chair;
			}
		}
		return chair;
	}

	private static int[] moveB(int[] chair)
	{
		for(int i = 0; i < chair.length; i++)
		{
			int j = chair.length - 1 - i;
			if(isnNeiborA(chair, j))
			{
				chair[j] = 2;
				return chair;
			}
		}
		for(int i = 0; i < chair.length; i++)
		{
			if(chair[i] == 0)
			{
				chair[i] = 2;
				return chair;
			}
		}
		return chair;
	}

	private static boolean isnNeiborA(int[] chair, int i)
	{
		if(i == 0)
		{
			return chair[i+1] != 1;
		} else
		if(i == chair.length - 1)
		{
			return chair[chair.length - 2] != 1;
		}
		return chair[i-1] != 1 && chair[i+1] != 1;
	}

	private static int[] moveC(int[] chair)
	{
		for(int i = 0; i < chair.length; i++)
		{
			if(successMan(chair, i))
			{
				return chair;
			}
		}
		chair[chair.length/2] = 3;
		return chair;
	}

	private static boolean successMan(int[] chair, int i)
	{
		if(i == 0)
		{
			if(chair[i] != 0 && chair[i+1] == 0)
			{
				chair[i+1] = 3;
				return true;
			}
		} else
		if(i == chair.length-1)
		{
			if(chair[i] != 0 && chair[i-1] == 0)
			{
				chair[i-1] = 3;
				return true;
			}
		} else
		{
			if(chair[i] != 0)
			{
				if(chair[i+1] == 0)
				{
					chair[i+1] = 3;
					return true;
				} else
				if(chair[i-1] == 0)
				{
					chair[i-1] = 3;
					return true;
				} else
				{
					return false;
				}
			} else
			{
				return false;
			}
		}
		return false;
	}

	private static int[] moveD(int[] chair)
	{
		int distance = -100;
		int distancechair = 0;
		for(int i = 0; i < chair.length; i++)
		{
			int d = getDinstanceMan(chair, i);
			if(d > distance)
			{
				distancechair = i;
				distance = d;
			}
		}
		chair[distancechair] = 4;
		return chair;
	}

	private static int getDinstanceMan(int[] chair, int index)
	{
		int j = 0;
		if(chair[index] != 0)
		{
			return -999;
		}
		for(int i = 0; i < chair.length*2; i++)
		{
			j = i / 2;
			int p = ((2 * (i % 2)) - 1)*j;
			//System.out.println("p:"+p+" index:"+(p+index));
			if(index + p < 0 || chair.length <= index + p)
			{
				continue;
			}
			if(chair[index+p] != 0)
			{
				return j;
			}
		}
		return j;
	}

	private static int[] getChair(String str)
	{
		StringTokenizer sz = new StringTokenizer(str);
		return new int[Integer.valueOf(sz.nextToken())];
	}

	// A -> 左からサーチ
	// B -> Aの隣以外右から 開いてなければ左から右
	// C -> 左からサーチ、右が空いてれば右へ、開いてなければ左へ、開いてなければ次へ
	//      全て空席なら真ん中(右寄り)
	// D -> 距離が一番大きい席(左端に近い)
	//      全て空席なら左端
	// # -> 空席

	private static void printyears(int i, int j)
	{
		boolean isFlag = false;
		for(int c = i; c <= j; c++)
		{
			if(isLeapyear(c))
			{
				System.out.println(c);
				isFlag = true;
			}
		}
		if(!isFlag)
		{
			System.out.println("NA");
		}
	}

	private static boolean isLeapyear(int c)
	{
		return c % 4 == 0 && c % 100 != 0 || c % 400 == 0;
	}

	//"1000 300 4378" -> long[]
	private static Long[] getParsedLonga(String str)
	{
		LinkedList<Long> relist = new LinkedList<Long>();
		relist.clear();
		StringTokenizer sz = new StringTokenizer(str);
		while(sz.hasMoreTokens())
		{
			relist.add(Long.valueOf(sz.nextToken()));
		}
		//ListからArrayへの変換
		Long[] result = relist.toArray(new Long[relist.size()]);
		return result;
	}

	//ロボット問題
	private static void doWork(LinkedList<String> orderList)
	{
		//スタックの山の数
		int num = Integer.valueOf(orderList.getFirst());
		orderList.removeFirst();
		@SuppressWarnings("unchecked")
		Stack<String>[] stacka = new Stack[num];
		for(int i = 0; i < stacka.length; i++)
		{
			stacka[i] = new Stack<String>();
		}
		for(int c = 0; c < orderList.size(); c++)
		{
			String order = orderList.get(c);
			if(order.equals("push"))
			{
				int sa = Integer.valueOf(orderList.get(++c)) - 1;
				String pushString = orderList.get(++c);
				stacka[sa].push(pushString);
			} else
			if(order.equals("pop"))
			{
				int sa = Integer.valueOf(orderList.get(++c)) - 1;
				String poped = stacka[sa].pop();
				System.out.println(poped);
			}
			if(order.equals("move"))
			{
				int sa = Integer.valueOf(orderList.get(++c)) - 1;
				int sb = Integer.valueOf(orderList.get(++c)) - 1;

				String poped = stacka[sa].pop();
				stacka[sb].push(poped);
			}
		}
	}

	//Taro <-> Hanako Card Game
	private static int getPoint(String string1, String string2)
	{
		if(string1.equals(string2))
		{
			return 1;
		}
		LinkedList<String> list = new LinkedList<String>();
		list.clear();
		list.add(string1);
		list.add(string2);
		Collections.sort(list);
		if(list.get(0).equals(string1))
		{
			return 0;
		} else
		{
			return 3;
		}
	}

	private static String[] getSplitStrings(String s)
	{
		LinkedList<String> relist = new LinkedList<String>();
		relist.clear();

		StringTokenizer sz = new StringTokenizer(s);
		while(sz.hasMoreTokens())
		{
			relist.add(sz.nextToken());
		}
		//ListからArrayへの変換
		String[] result = relist.toArray(new String[relist.size()]);
		return result;
	}

	private static double getDevideChild(double[] scores, double average)
	{
		double result = 0D;
		for(int i = 0; i < scores.length; i++)
		{
			result += Math.pow((scores[i] - average), 2D);
		}
		return result;
	}

	private static double getAverage(double[] scores)
	{
		double result = 0D;
		for(int i = 0; i < scores.length; i++)
		{
			result += scores[i];
		}
		return (result /= scores.length);
	}

	private static double getDistance(double[] points)
	{
		double dx0 = points[0];
		double dy0 = points[1];
		double dx1 = points[2];
		double dy1 = points[3];
		double dx = dx1 - dx0;
		double dy = dy1 - dy0;
		return Math.sqrt(dx*dx+dy*dy);
	}

	private static double[] getParsedDoublea(String s)
	{
		StringTokenizer sz = new StringTokenizer(s);
		ArrayList<Double> reslist = new ArrayList<Double>();
		while(sz.hasMoreTokens())
		{
			reslist.add(Double.valueOf(sz.nextToken()));
		}
		double[] result = new double[reslist.size()];
		for(int i = 0; i < result.length; i++)
		{
			result[i] = reslist.get(i);
		}
		return result;
	}

	private static String shuffle(String reg, int i)
	{
		System.out.println(reg+" to "+reg.substring(i, reg.length()) + reg.substring(0, i));
		return reg.substring(i, reg.length()) + reg.substring(0, i);
	}

	private static int[] getCharCounts(String s)
	{
		int[] result = new int['z'-'a'+1];
		for(int i = 0; i < s.length(); i++)
		{
			Character c = s.charAt(i);
			if(Character.isLetter(c))
			{
				c = Character.toLowerCase(c);
				int num = (int)c - 'a';
				result[num]++;
			}
		}
		return result;
	}

	private static int getCount(String s)
	{
		int result = 0;
		for(int i = 0; i < s.length(); i++)
		{
			result += Integer.valueOf(s.substring(i, i+1));
		}
		return result;
	}

	private static String getParsedString(String s)
	{
		String result = "";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isLowerCase(c))
			{
				c = Character.toUpperCase(c);
			} else
			if(Character.isUpperCase(c))
			{
				c = Character.toLowerCase(c);
			}
			result += c;
		}
		return result;
	}

	private static int getCount(int num, int max)
	{
		int result = 0;
		LinkedList<String> buffer = new LinkedList<String>();
		buffer.clear();
		for(int i = 1; i <= num; i++)
		{
			for(int j = 1; j <= num; j++)
			{
				for(int k = 1; k <= num; k++)
				{
					if(i + j + k == max && nEq(i, j, k))
					{
						int[] res = getSorted(i, j, k);
						String s = String.valueOf(res[0]+","+res[1]+","+res[2]);
						if(!buffer.contains(s))
						{
							buffer.add(s);
							result++;
						}
					}
				}
			}
		}
		return result;
	}

	private static boolean nEq(int i, int j, int k)
	{
		return i != j && i != k && j != k;
	}

	private static int[] getSorted(int ... param)
	{
		for(int i = 0; i < param.length - 1; i++)
		{
			for(int j = 0; j < param.length - 1 - i; j++)
			{
				if(param[j] > param[j+1])
				{
					param = swap(param.clone(), j, j+1);
				}
			}
		}
		return param;
	}

	private static int[] swap(int[] param, int i, int j)
	{
		int tmp = param[i];
		param[i] = param[j];
		param[j] = tmp;
		return param;
	}

	public static int[] getSpritIntegers(String s) throws Exception
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.clear();
		StringTokenizer sz = new StringTokenizer(s);
		while(sz.hasMoreTokens())
		{
			list.add(Integer.valueOf(sz.nextToken()));
		}
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++)
		{
			result[i] = list.get(i);
		}
		return result;
	}
}