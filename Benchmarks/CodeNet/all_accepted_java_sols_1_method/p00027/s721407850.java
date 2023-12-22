import java.util.*;
import java.io.*;

class Main{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    String week[]={"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
    for(;;){
    int day=0;
    int m =sc.nextInt();
    int d =sc.nextInt();
    if(m==0) break;
    day+=d;
    for(int i=2; i<=m; i++){
    if(i==5||i==7||i==10||i==12)day+=30;
    else if(i==3)day+=29;
    else day+=31;
    }
   System.out.println(week[day%7]);
    }
	}
}