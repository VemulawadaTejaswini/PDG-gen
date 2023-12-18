import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String str = sc.next();
        sc.close();
        long count = 0;

        String[] strList = str.split("");
        long white = Stream.of(strList).filter(e -> e.equals("W")).count();
        long red = n - white;
        String[] copyList = strList.clone();
        Arrays.sort(copyList);
        
        for(int i = 0; i < n; i++){
            if(!strList[i].equals(copyList[i])){
                count++;
            }
        }
        count = count / 2;
        System.out.println(Math.min(white, Math.min(red, count)));
    }
}