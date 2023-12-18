import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			char[] cStr=str.toCharArray();
			int[] iStr=new int[cStr.length];
			for(int i=0;i<cStr.length;i++){
				if(cStr[i]=='I'){
					iStr[i]=1;
				}else if(cStr[i]=='V'){
					iStr[i]=5;
				}else if(cStr[i]=='X'){
					iStr[i]=10;
				}else if(cStr[i]=='L'){
					iStr[i]=50;
				}else if(cStr[i]=='C'){
					iStr[i]=100;
				}else if(cStr[i]=='D'){
					iStr[i]=500;
				}else if(cStr[i]=='M'){
					iStr[i]=1000;
				}
			}
			int sum=iStr[iStr.length-1];
			for(int i=iStr.length-2;i>=0;i--){
				if(iStr[i]<iStr[i+1]){
					sum-=iStr[i];
				}else{
					sum+=iStr[i];
				}
			}
			System.out.println(sum);
		}
	}
}