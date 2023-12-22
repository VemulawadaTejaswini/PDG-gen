import java.util.Scanner;

public class Main {

	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		while (sc.hasNext()){
			String str = sc.next();
			String[] st =str.split("");
			int[] num=new int[9];
			String ans="d";

			 //o,x,d?????°??????
			 for(int i=0;i<9;i++){
				 if(st[i].equals("o")){
					 num[i]=1;
				 }else if(st[i].equals("x")){
					 num[i]=4;
				 }else{
					 num[i]=0;
				 }
			 }
			 //?¨??????????
			 for(int i=0;i<9;i+=3){
				 if(num[i]+num[i+1]+num[i+2]==3){
					 ans="o";
				 }else if(num[i]+num[i+1]+num[i+2]==12){
					 ans="x";
				 }
			 }
			 //????????????
			 for(int i=0;i<3;i++){
				 if(num[i]+num[i+3]+num[i+6]==3){
					 ans="o";
				 }else if(num[i]+num[i+3]+num[i+6]==12){
					 ans="x";
				 }
			 }
			 //??????????????????
			 if(num[0]+num[4]+num[8]==3||num[2]+num[4]+num[6]==3){
				 ans="o";
			 }else if(num[0]+num[4]+num[8]==12||num[2]+num[4]+num[6]==12){
				 ans="x";
			 }
			 System.out.println(ans);

		}

	}

}