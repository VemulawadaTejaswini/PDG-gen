import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
      	String s="";
      for(int i=0;i<15;i++){
        if(n==0){break;}
      	long a =n%26;
      	s=s+alphabet(a);
      	if(a!=0)n=n/26;
        else{n=n/26-1;}
      }
      StringBuffer buf = new StringBuffer(s);
      String ans = buf.reverse().toString();
      System.out.println(ans);
    }
  
  public static String alphabet(long i){
  	if(i==1){return("a");}
    if(i==2){return("b");}
    if(i==3){return("c");}
    if(i==4){return("d");}
    if(i==5){return("e");}
    if(i==6){return("f");}
    if(i==7){return("g");}
    if(i==8){return("h");}
    if(i==9){return("i");}
    if(i==10){return("j");}
    if(i==11){return("k");}
    if(i==12){return("l");}
    if(i==13){return("m");}
    if(i==14){return("n");}
    if(i==15){return("o");}
    if(i==16){return("p");}
    if(i==17){return("q");}
    if(i==18){return("r");}
    if(i==19){return("s");}
    if(i==20){return("t");}
    if(i==21){return("u");}
    if(i==22){return("v");}
    if(i==23){return("w");}
    if(i==24){return("x");}
    if(i==25){return("y");}
    if(i==0){return("z");}
    return("");
  }
  
}