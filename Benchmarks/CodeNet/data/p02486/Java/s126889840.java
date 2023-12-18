import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){
			String s=scanner.nextLine();
			String[] t=s.split(" ");
			int max=Integer.parseInt(t[0]);
			int sum=Integer.parseInt(t[1]);
			if(max==0 && sum==0)break;

			System.out.println(ans(max,sum));
		}
	}

	public static int ans(int max,int sum){
		int count=0;
		for(int x=1;x<=max;x++){
			for(int y=(x+1);y<=max;y++){
				for(int z=(y+1);z<=max;z++){
					if(z!=x && z!=y && sum==(x+y+z)){
						count++;
					}
				}
			}
		}
		return count;
	}
}