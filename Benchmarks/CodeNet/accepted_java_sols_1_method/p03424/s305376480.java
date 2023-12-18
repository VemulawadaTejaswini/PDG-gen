import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set s = new HashSet();
        for(int i=0;i<n;i++){
            s.add(sc.next());
        }
        if(s.size()==3){
            System.out.println("Three");
        }
        else{
            System.out.println("Four");
        }
    }
}