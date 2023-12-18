import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        List<String> listA = new ArrayList<String>();
        for(int i=0;i<a;i++){
            String n=scan.next();
            //System.out.println(n);
            listA.add(n);
            //System.out.println("ListA = " + listA);
        }
        List<String> listB = listA.stream().distinct().collect(Collectors.toList());

       // System.out.println("ListA = " + listA);
        //System.out.println("ListB = " + listB);
        System.out.println(listB.size());
            }
        }

