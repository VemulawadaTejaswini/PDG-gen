import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		while(true){
			int mid=sc.nextInt();
			int fin=sc.nextInt();
			int re =sc.nextInt();
			if(mid==-1&&fin==-1&&re==-1){break;}
			int score =mid+fin;
			
			if(mid==-1||mid==-1){System.out.println("F");}
			else if(score>=80){System.out.println("A");}
			else if(score<80&&score>=65){System.out.println("B");}
			else if(score>=50&&score<65){
				System.out.println("C");}
			else if(score>=30&&score<50){
				if(re>=50){System.out.println("C");}
					else{System.out.println("D");}
				}
			else if(score<30){System.out.println("F");}
		}

}    
}