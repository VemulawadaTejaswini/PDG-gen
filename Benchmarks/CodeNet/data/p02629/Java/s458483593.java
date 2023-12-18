import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long n=sc.nextLong();
	  StringBuilder s=new StringBuilder();
	  while(true) {
		  if(n%26==1) {
			  s.append("a");
		  }else if(n%26==2) {
			  s.append("b");
		  }else if(n%26==3) {
			  s.append("c");
		  }else if(n%26==4) {
			  s.append("d");
		  }else if(n%26==5) {
			  s.append("e");
		  }else if(n%26==6) {
			  s.append("f");
		  }else if(n%26==7) {
			  s.append("g");
		  }else if(n%26==8) {
			  s.append("h");
		  }else if(n%26==9) {
			  s.append("i");
		  }else if(n%26==10) {
			  s.append("j");
		  }else if(n%26==11) {
			  s.append("k");
		  }else if(n%26==12) {
			  s.append("l");
		  }else if(n%26==13) {
			  s.append("n");
		  }else if(n%26==14) {
			  s.append("m");
		  }else if(n%26==15) {
			  s.append("o");
		  }else if(n%26==16) {
			  s.append("p");
		  }else if(n%26==17) {
			  s.append("q");
		  }else if(n%26==18) {
			  s.append("r");
		  }else if(n%26==19) {
			  s.append("s");
		  }else if(n%26==20) {
			  s.append("t");
		  }else if(n%26==21) {
			  s.append("u");
		  }else if(n%26==22) {
			  s.append("v");
		  }else if(n%26==23) {
			  s.append("w");
		  }else if(n%26==24) {
			  s.append("x");
		  }else if(n%26==25) {
			  s.append("y");
		  }else if(n%26==0) {
			  s.append("z");
		  }
		  if(n<=26)break;
		  n/=26;
	  }
	  System.out.println(s);
  }
}

