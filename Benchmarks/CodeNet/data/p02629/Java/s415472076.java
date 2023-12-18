import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long x=sc.nextLong()-1;
	  int n=26;
	  String buff=Long.toString(x,n);
	  StringBuilder res=new StringBuilder();
	  for(int i=0;i<buff.length();i++){
		  if(i==0) {
		  if(buff.substring(i, i+1).equals("1")) {
			  res.append("a");
		  }else if(buff.substring(i, i+1).equals("2")) {
			  res.append("b");
		  }else if(buff.substring(i, i+1).equals("3")) {
			  res.append("c");
		  }else if(buff.substring(i, i+1).equals("4")) {
			  res.append("d");
		  }else if(buff.substring(i, i+1).equals("5")) {
			  res.append("e");
		  }else if(buff.substring(i, i+1).equals("6")) {
			  res.append("f");
		  }else if(buff.substring(i, i+1).equals("7")) {
			  res.append("g");
		  }else if(buff.substring(i, i+1).equals("8")) {
			  res.append("h");
		  }else if(buff.substring(i, i+1).equals("9")) {
			  res.append("i");
		  }else if(buff.substring(i, i+1).equals("a")) {
			  res.append("j");
		  }else if(buff.substring(i, i+1).equals("b")) {
			  res.append("k");
		  }else if(buff.substring(i, i+1).equals("c")) {
			  res.append("l");
		  }else if(buff.substring(i, i+1).equals("d")) {
			  res.append("n");
		  }else if(buff.substring(i, i+1).equals("e")) {
			  res.append("m");
		  }else if(buff.substring(i, i+1).equals("f")) {
			  res.append("o");
		  }else if(buff.substring(i, i+1).equals("g")) {
			  res.append("p");
		  }else if(buff.substring(i, i+1).equals("h")) {
			  res.append("q");
		  }else if(buff.substring(i, i+1).equals("i")) {
			  res.append("r");
		  }else if(buff.substring(i, i+1).equals("j")) {
			  res.append("s");
		  }else if(buff.substring(i, i+1).equals("k")) {
			  res.append("t");
		  }else if(buff.substring(i, i+1).equals("l")) {
			  res.append("u");
		  }else if(buff.substring(i, i+1).equals("m")) {
			  res.append("v");
		  }else if(buff.substring(i, i+1).equals("n")) {
			  res.append("w");
		  }else if(buff.substring(i, i+1).equals("o")) {
			  res.append("x");
		  }else if(buff.substring(i, i+1).equals("p")) {
			  res.append("y");
		  }else if(buff.substring(i, i+1).equals("q")) {
			  res.append("z");
		  }
		  }else {
			  if(buff.substring(i, i+1).equals("0")) {
				  res.append("a");
			  }else if(buff.substring(i, i+1).equals("1")) {
				  res.append("b");
			  }else if(buff.substring(i, i+1).equals("2")) {
				  res.append("c");
			  }else if(buff.substring(i, i+1).equals("3")) {
				  res.append("d");
			  }else if(buff.substring(i, i+1).equals("4")) {
				  res.append("e");
			  }else if(buff.substring(i, i+1).equals("5")) {
				  res.append("f");
			  }else if(buff.substring(i, i+1).equals("6")) {
				  res.append("g");
			  }else if(buff.substring(i, i+1).equals("7")) {
				  res.append("h");
			  }else if(buff.substring(i, i+1).equals("8")) {
				  res.append("i");
			  }else if(buff.substring(i, i+1).equals("9")) {
				  res.append("j");
			  }else if(buff.substring(i, i+1).equals("a")) {
				  res.append("k");
			  }else if(buff.substring(i, i+1).equals("b")) {
				  res.append("l");
			  }else if(buff.substring(i, i+1).equals("c")) {
				  res.append("n");
			  }else if(buff.substring(i, i+1).equals("d")) {
				  res.append("m");
			  }else if(buff.substring(i, i+1).equals("e")) {
				  res.append("o");
			  }else if(buff.substring(i, i+1).equals("f")) {
				  res.append("p");
			  }else if(buff.substring(i, i+1).equals("g")) {
				  res.append("q");
			  }else if(buff.substring(i, i+1).equals("h")) {
				  res.append("r");
			  }else if(buff.substring(i, i+1).equals("i")) {
				  res.append("s");
			  }else if(buff.substring(i, i+1).equals("j")) {
				  res.append("t");
			  }else if(buff.substring(i, i+1).equals("k")) {
				  res.append("u");
			  }else if(buff.substring(i, i+1).equals("l")) {
				  res.append("v");
			  }else if(buff.substring(i, i+1).equals("m")) {
				  res.append("w");
			  }else if(buff.substring(i, i+1).equals("n")) {
				  res.append("x");
			  }else if(buff.substring(i, i+1).equals("o")) {
				  res.append("y");
			  }else if(buff.substring(i, i+1).equals("p")) {
				  res.append("z");
			  }
		  }
	  }
	  System.out.println(res);
  }
}
