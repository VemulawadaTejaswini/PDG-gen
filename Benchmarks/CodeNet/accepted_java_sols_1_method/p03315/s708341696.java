import java.util.*;


class Main {
    public static void main(String[] args) {
   		Scanner sc=new Scanner(System.in);
   		String str=sc.next();
   		int num=0;
   		for(int i=0;i<str.length();i++){
   			if(str.charAt(i)=='+')num++;
   			else num--;
   		}
   		System.out.println(num);
   		sc.close();
    }
}