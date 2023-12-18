import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nyuryoku = sc.nextLine();
 	String[] kari = nyuryoku.split(" ",0);
	int a = Integer.parseInt(kari[0]);
	int b = Integer.parseInt(kari[1]);

        System.out.println(a*b + " " + (a+b) * 2);
    }
}