import java.util.*;
class Pair
{
	int first;
	int second;
	public Pair(int first, int second)
	{
		this.first = first;
		this.second = second;
	}
}

class MyComparator implements java.util.Comparator<Object>
{
	public int compare(Object object1, Object object2)
	{
        return ((Comparable)object1).compareTo(object2) * -1;
    }

}

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		Set<Integer> set = new TreeSet<Integer>(new MyComparator());
		List<Pair> list = new ArrayList<Pair>();
		int score = 0;
		while(stdIn.hasNext())
		{
			String[] str = stdIn.next().split(",");
			int num = Integer.parseInt(str[0]);
			score = Integer.parseInt(str[1]);
			if(num == 0 && score == 0)
			{
				break;
			}
			set.add(score);
			list.add(new Pair(num, score));
		}
		while(stdIn.hasNext())
		{
			int num = stdIn.nextInt();
			for(int i = 0; i < list.size(); ++i)
			{
				if(list.get(i).first == num)
				{
					score = list.get(i).second;
					break;
				}
			}
			Iterator<Integer> it = set.iterator();
			int count = 1;
			while(it.hasNext())
			{
				int temp = it.next();
				if(temp == score)
				{
					System.out.println(count);
				}
				++count;
			}
		}
	}
}