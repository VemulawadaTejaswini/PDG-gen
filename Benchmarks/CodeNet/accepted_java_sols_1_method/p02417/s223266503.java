import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cou = new int[26];

        while(sc.hasNext()){
            String str = sc.next();
            char[] ch =str.toCharArray();
            int le = str.length();
            for(int i=0;i<le;i++){
                for(int k=0;k<26;k++){
                    if(ch[i]==(65+k) || ch[i]==97+k){
                        cou[k]++;
                    }
                }
            }

        }

        for(int i=0;i<26;i++){
            int c = 97+i;
            System.out.println((char)c+" : "+cou[i]);
        }

        sc.close();
    }
}

