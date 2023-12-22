import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] months={31,29,31,30,31,30,31,31,30,31,30,31};
		while(sc.hasNext()){
			int month=sc.nextInt();
			int day=sc.nextInt();
			if(month==0){
				break;
			}
			int days=0;
			for(int i=0;i<month-1;i++){
				days=days+months[i];
			}
			days=days+day;
			int today=days%7;
			if(today==0){
				System.out.println("Wednesday");
			}else if(today==1){
				System.out.println("Thursday");
			}else if(today==2){
				System.out.println("Friday");
			}else if(today==3){
				System.out.println("Saturday");
			}else if(today==4){
				System.out.println("Sunday");
			}else if(today==5){
				System.out.println("Monday");
			}else{
				System.out.println("Tuesday");
			}
		}
	}
}