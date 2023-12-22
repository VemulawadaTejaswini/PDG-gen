import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[n];
		int n = sc.nextInt();
		int[] array = new int[n+1];

		for(int i=0;n+1>i;i++) {
			array[i]=0;
		}
		for(int i=0;n-1>i;i++) {
			int a = sc.nextInt();
			//list.add(a);
			array[a-1]++;
		}

		for(int i=0;n>i;i++) {
			System.out.println(array[i]);
		}
		/*

		int max = Collections.max(list);
		int[] answer = new int[n];
		for(int i=0;n>i;i++) {
			answer[i]=0;
		}
		System.out.println(array[1]);
		loop :for(int i=1;max+1>i;i++) {
			for(int j=0;n-1>j;j++) {
				if(list.get(j)==i) {
					answer[j]=array[i+1];
					continue loop;
				}
			}
		}
		for(int i=0;n-1>i;i++) {
			System.out.println(answer[i]);
		}
		*/

	}
}