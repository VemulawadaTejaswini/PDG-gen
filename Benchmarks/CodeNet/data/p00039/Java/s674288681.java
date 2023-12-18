import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			char[] cStr=str.toCharArray();
			int[] iStr=new int[cStr.length];
			for(int i=0;i<cStr.length;i++){
				if(Character.toString(cStr[i]).equals("I")){
					iStr[i]=1;
				}else if(Character.toString(cStr[i]).equals("V")){
					iStr[i]=5;
				}
				else if(Character.toString(cStr[i]).equals("X")){
					iStr[i]=10;
				}else if(Character.toString(cStr[i]).equals("L")){
					iStr[i]=50;
				}else if(Character.toString(cStr[i]).equals("C")){
					iStr[i]=100;
				}else if(Character.toString(cStr[i]).equals("D")){
					iStr[i]=500;
				}else if(Character.toString(cStr[i]).equals("M")){
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