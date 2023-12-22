import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str,num;
        int i;
        char a;
        int sum[] = new int[26];
        str = "";
        while(scan.hasNext()) {
            str += scan.nextLine();
        }
        StringBuilder sb = new StringBuilder();
        for ( i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                ++sum[c-65];
            }else if(Character.isLowerCase(c)){
                ++sum[c-97];
            }

        }
        for(i=0;i<26;i++){
            a = (char)(97+i);
            System.out.println(a+" : "+sum[i]);
        }

        scan.close();
    }

}

