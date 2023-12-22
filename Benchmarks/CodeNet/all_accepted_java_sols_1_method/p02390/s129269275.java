import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int sec = sc.nextInt();
System.out.println(sec/3600 + ":" + (sec/60)%60 + ":" + sec%60);

}

}
