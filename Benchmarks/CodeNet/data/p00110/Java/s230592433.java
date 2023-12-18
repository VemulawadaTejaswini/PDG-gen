import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			boolean flag=false;
			for(int i=0;i<=9;i++){
				char[] cArray=str.replace("X",Integer.toString(i)).toCharArray();
				String[] strArray=new String[3];
				for(int j=0;j<3;j++){
					strArray[j]="";
				}
				int ptr=0;
				for(int j=0;j<cArray.length;j++){
					if(Character.isDigit(cArray[j])){
						strArray[ptr]+=cArray[j]+"";
					}else{
						ptr++;
					}
				}
				BigInteger[] a=new BigInteger[3];
				for(int j=0;j<3;j++){
					a[j]=new BigInteger(strArray[j]);
				}
				if(a[0].add(a[1]).equals(a[2])){
					System.out.println(i);
					flag=true;
					break;
				}
			}
			if(!flag){
				System.out.println("NA");
			}
		}
	}
}