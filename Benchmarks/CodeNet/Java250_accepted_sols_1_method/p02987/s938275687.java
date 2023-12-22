import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String[] Sarray = new String[S.length()];
        for(int i=0;i<S.length();i++){
            String tmps = String.valueOf(S.charAt(i));
            Sarray[i] = tmps;
        }
        String tmps = Sarray[0];
        boolean f = false;
        int count = 0;
        for(int i=1;i<4;i++){
            if(String.valueOf(Sarray[i]).equals(tmps)){
                count++;
            }
        }
        if(count==3){
            f = true;
        }
        List<String> list = new ArrayList<String>();        
        for(int i=0;i<4;i++){
            list.add(Sarray[i]);
        }
        Collections.sort(list);
        String[] array = list.toArray(new String[list.size()]);
        if((f==false)&&String.valueOf(array[0]).equals(String.valueOf(array[1]))&&String.valueOf(array[2]).equals(String.valueOf(array[3]))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}