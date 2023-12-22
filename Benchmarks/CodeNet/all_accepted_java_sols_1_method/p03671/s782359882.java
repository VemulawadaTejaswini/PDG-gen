import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
ArrayList<Integer> li = new ArrayList<>();
li.add(sc.nextInt());
li.add(sc.nextInt());
li.add(sc.nextInt());
Collections.sort(li);
int total = li.get(0) + li.get(1);
System.out.println(total);


}
}