package practice;
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n,mix,max,min;
mix = 0;
max =-1000000;
min =1000000;
n =sc.nextInt();
 for(;n>0;n--){
	 int m =sc.nextInt();
	mix += m;
	 if(m >= max) max =m;
	if(m <= min) min =m;
 }
System.out.println(min+" "+max+" "+mix);
	 }
	}