import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = 0;	//中間試験
		int f = 0;	//期末試験
		int r = 0;	//再試験
		int sum;//中間試験と期末試験の点数の合計
        while(true){
			 m = Integer.parseInt(scan.next());
			 f = Integer.parseInt(scan.next());
			 r = Integer.parseInt(scan.next());
			 sum = m + f;
			 if(m == -1 && f ==-1 && r == -1){
				 break;
			 }else{
				 if(m == -1 || f == -1){
					 System.out.println("F");
				 }else if(sum >= 80){
					 System.out.println("A");
				 }else if(sum >= 65 && sum <= 80){
					 System.out.println("B");
				 }else if(sum >= 50 && sum <= 65){
					 System.out.println("C");
				 }else if(sum >= 30 && sum <= 50){
					 if(r >= 50){
						 System.out.println("C");
					 }else{
						 System.out.println("D");
					 }
				 }else{
					 System.out.println("F");
				 }//if
			 }//if
		 }//while 
	}
}