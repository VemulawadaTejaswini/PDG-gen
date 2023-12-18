import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        List<Integer> lista = new ArrayList<Integer>();
        long rangeStart = Math.round(a * 12.5);
        long rangeEnd = (Math.round((a + 1)* 12.5));
        for(int i = (int)rangeStart; i<rangeEnd;i++){
            lista.add(i);
        }
        List<Integer> listb = new ArrayList<Integer>();
        rangeStart = b * 10;
        rangeEnd = (b + 1 ) * 10;
        for(int i = (int)rangeStart; i<rangeEnd;i++){
            listb.add(i);
        }
        for(int j=0;j<lista.size();j++){
            for(int k=0;k<listb.size();k++){
                if(lista.get(j).equals(listb.get(k))){
                    System.out.println(lista.get(j));
                    return;
                }
            
            }

        }
        System.out.println("-1");


    }
}