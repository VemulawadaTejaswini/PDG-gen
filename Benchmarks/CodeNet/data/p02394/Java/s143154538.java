import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);


int w = sc.nextInt();

int h = sc.nextInt();

int x = sc.nextInt();

int y = sc.nextInt();

int r = sc.nextInt();

int mainasu = x-r;
int plas = x+r;

if(mainasu < 0 || plas > w){
	System.out.println("No");
}else if(mainasu >= 0 && plas <= w){
System.out.println("Yes");
}
}

}
