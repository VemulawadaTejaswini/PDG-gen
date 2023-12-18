

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//总体原理：让大的数据分几个小组，逐渐有序
public class Main {
	private static int cnt = 0;
	private static void  insertI(int[] a, int g) {//给每一个间隔为g的组排序
		//g为第一个组的第二个元素
		for (int i = g; i < a.length; ++i) {//组不一定规则
			int v = a[i];
			int j = i - g;//寻找前一个元素
			//从小到大排序
			
			while (j >= 0 && a[j] > v) {//索引存在，且当前索引指向的值大于插入值
				a[j + g] = a[j];//当前j被空下来
				j -= g;//找到组中的前一个元素
				cnt++;
			}
			a[j + g] = v;
		}
		
		System.out.print(g);
		if (g == 1)
			System.out.println();
		else
			System.out.print(" ");
	}

	private static void shellSort(int[] a, List<Integer> G) {
		for (int i = G.size() - 1; i >= 0; --i) //增量逐渐减小必定有1
			insertI(a, G.get(i));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int h = 1;;) {
			if (h > n) break;
			list.add(h);
			h = 3 * h + 1;
		}
		System.out.println(list.size());
		shellSort(a, list);
		
		//show(list);
		System.out.println(cnt);
		for (int i : a)
			System.out.println(i);
	}
}

