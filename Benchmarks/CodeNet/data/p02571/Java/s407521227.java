import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        int min_count = Integer.MAX_VALUE,count = 0;
        for(int i = 0;i<=n1-n2;i++){
            if(str1.substring(i,i+n2).equals(str2)){
                min_count = 0;
                break;
            }
            else{
                count = 0;
                for(int j = i;j<i+n2;j++){
                    if(str1.charAt(j) != str2.charAt(j-i))
                        count++;
                }    
            }
            min_count = Math.min(count,min_count);
            //System.out.print(min_count + " ");
        }
        //System.out.println();
        System.out.println(min_count);
    }
}