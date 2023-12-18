
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main{


	static Function<List<Integer>,String> toStr = ls -> {
		StringBuilder sb = new StringBuilder();
		for(Integer i: ls)
			sb.append(i);
		return String.valueOf(Integer.parseInt(sb.toString()));
	};
	static BiFunction<Integer,Integer,List<Integer>> toL = (d,l) -> {
		List<Integer> ls = new LinkedList<>();
		String tmp = new Integer(d).toString();
		for(int i = 0; i < l - tmp.length() ; i++)
			ls.add(0);

		for(String s: tmp.split(""))
			ls.add(Integer.parseInt(s));
		return ls;
	};

	static Function<List<Integer>,Integer> toI = ls ->
	{
		Integer tmp = 0;
		for(int i = 0;i < ls.size();i ++)
		{
			tmp += (int) (ls.get(i) * Math.pow(10,ls.size() - (i + 1)));
		}
		return tmp;
	};

	static Consumer<Dataset> solveD = data -> {
		List<List<Integer>> history = new LinkedList<>();
		List<Integer> num = toL.apply(data.a,data.l);
		history.add(num);
		List<Integer> max,min;
		int j = 0;
		for(int i = 0;;i++)
		{
			max = num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			min = num.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
			num = toL.apply(toI.apply(max) - toI.apply(min),data.l);
			j = history.indexOf(num);
			if(j >= 0)
			{
				System.out.println(j + " " + toStr.apply(num) + " " + (i-j+1));
				break;
			}
			else
				history.add(num);
		}

	};

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		LinkedList<Dataset> ls = readD();
		ls.parallelStream().forEachOrdered(e->solveD.accept(e));
	}





	static LinkedList<Dataset> readD()
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Dataset> res = new LinkedList<>();
		int a,l;
		while(true)
		{
			a = sc.nextInt();
			l = sc.nextInt();
			if(a == 0 && l == 0)
				return res;
			else
				res.add(new Dataset(a,l));
		}
	}

}
class Dataset
{
	int a;
	int l;
	Dataset(int a,int l)
	{
		this.a = a;
		this.l = l;
	}
}