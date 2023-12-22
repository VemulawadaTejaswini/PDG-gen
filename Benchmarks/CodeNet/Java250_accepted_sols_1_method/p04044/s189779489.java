import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
int n;
List<String> array = new ArrayList<String>();
n=sc.nextInt();
sc.nextLine();
for(int i=0;i<n;i++)
array.add(sc.nextLine());
Collections.sort(array);
for(int i=0;i<n;i++)
System.out.print(array.get(i));
}}