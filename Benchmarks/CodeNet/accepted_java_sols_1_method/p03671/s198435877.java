import java.util.*;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList arrayList=new ArrayList();
    for (int i = 0; i <3; i++) {
        arrayList.add(scanner.nextInt());
    }
    Collections.sort(arrayList);
    int sum=0;
    for (int i = 0; i <2; i++) {
        int arr= (int) arrayList.get(i);
        sum+=arr;
    }
    System.out.println(sum);
}
}