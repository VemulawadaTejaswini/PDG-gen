import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class Main{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int m = sc.nextInt();
int sum = 0;
ArrayList<ArrayList<Integer>> List = new ArrayList<ArrayList<Integer>>();


for(int i = 0 ; i < n ; i++){
  ArrayList<Integer> List2 = new ArrayList<Integer>();
  for(int j = 0; j < m ; j++){
    List2.add(sc.nextInt());

  }
List.add(List2);
}


ArrayList<Integer> List3 = new ArrayList<Integer>();

for(int i = 0 ; i < m ; i++){
  List3.add(sc.nextInt());

}//Input Vectors

int cnt=0;
for(ListIterator<ArrayList<Integer>> it = List.listIterator(); it.hasNext();){
  for(ListIterator<Integer> itt = (it.next()).listIterator();itt.hasNext();){

sum += (itt.next())*(List3.get(cnt));
cnt++;
  }
cnt = 0;
System.out.println(sum);
sum = 0;
}

}//main



}//class

