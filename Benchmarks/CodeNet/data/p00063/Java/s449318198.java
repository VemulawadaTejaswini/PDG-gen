import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			boolean flag=true;
			for(int i=0;i<c.length/2;i++){
				if(c[i]!=c[c.length-i-1]){
					flag=false;
					break;
				}
			}
			if(flag){
				count++;
			}
		}
		System.out.println(count);
	}
}