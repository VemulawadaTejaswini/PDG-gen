import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> mountain = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            mountain.add(sc.nextInt());
        }
        Collections.sort(mountain);
        System.out.println(mountain.get(mountain.size()-1));
        System.out.println(mountain.get(mountain.size()-2));
        System.out.println(mountain.get(mountain.size()-3));
    }
}