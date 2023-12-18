import java.util.Scanner;
	public class Main{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				String str = sc.nextLine();
				String get;
				int sum = 0;
				int val = 0;
				for(int i =str.length()-1; i  >= 0;i--){
					get=String.valueOf(str.charAt(i));
					switch(get){
					case "I":
						if(val<=1){
						sum+=1;
						}else{
							sum-=1;
						}
						val=1;
						continue;
					case "V":
						if(val<=5)sum+=5;
						else sum-=5;
						val=5;
						continue;
					case "X":
						if(val<=10)sum+=10;
						else sum-=10;
						val=10;
						continue;
					case "L":
						if(val<=50)sum+=50;
						else sum-=50;
						val=50;
						continue;
					case "C":
						if(val<=100)sum+=100;
						else sum-=100;
						val=100;
						continue;
					case "D":
						if(val<=500)sum+=500;
						else sum-=500;
						val=500;
						continue;
					case "M":
						if(val<=1000)sum+=1000;
						else sum-=1000;
						val=1000;
						continue;
					}
				}
				System.out.println(sum);
			}
	}
}