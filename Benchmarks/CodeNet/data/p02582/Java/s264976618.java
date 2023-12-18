import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] wchar = sc.nextLine().toCharArray();
        int count = 0;

        if(wchar[0] == 'R' && wchar[1] == 'S' && wchar[2] =='S'){
          count =1;
        }else if(wchar[0] == 'S' && wchar[1] == 'R' && wchar[2] =='S'){
          count =1;
        }else if(wchar[0] == 'S' && wchar[1] == 'S' && wchar[2] =='R'){
          count =1;
        }else if((wchar[0]=='R' && wchar[1] == 'R' && wchar[2] == 'S') || (wchar[0] == 'S' && wchar[1]=='R' && wchar[2]=='R')){
         count = 2;
        }else if(wchar[0]=='R' && wchar[1] == 'R' && wchar[2] == 'R'){
          count = 3;
        }else{
          count = 0;
        }
        System.out.println(count);
    }
}