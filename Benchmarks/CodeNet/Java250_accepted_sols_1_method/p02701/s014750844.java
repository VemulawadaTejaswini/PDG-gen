import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
	int N;
  Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int i=0;
    ArrayList<String> strList = new ArrayList<String>();
    do {
    strList.add(sc.next());
    i++;
}while(i<N);
    List<String> listA= strList;
    List<String> listB = new ArrayList<String>(new LinkedHashSet<>(listA));
	
    System.out.println(listB.size());
	sc.close();
	
	
	}}