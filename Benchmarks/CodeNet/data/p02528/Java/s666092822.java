import java.util.Scanner;

class Main{
	static int count;
	static int[] ans;
	static int index;
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		count = scanner.nextInt();
		Thread[] list=new Thread[count];
		ans=new int[count];
		for(int i=0;i<count;i++){
			final int a=scanner.nextInt();
			list[i]=new Thread(){
				@Override
				public void run(){
					try {
						Thread.sleep(a);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ans[index]=a;
					index++;
				}
			};
		}

		for(Thread th:list){
			th.start();
		}
		for(Thread th:list){
			try {
				th.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String s="";
		for(int i:ans){
			s+=i+" ";
		}
		System.out.println(s.trim());
	}
}