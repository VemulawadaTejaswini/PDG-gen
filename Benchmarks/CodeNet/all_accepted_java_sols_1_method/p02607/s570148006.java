import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       //List<Integer>list=new ArrayList<>();
       int count=0;
       for(int i=0;i<num;i++){
        int a=sc.nextInt();
        if((i+1)%2!=0&&a%2!=0)count++;
       }
       System.out.println(count);
       sc.close();
    }
} 

 
