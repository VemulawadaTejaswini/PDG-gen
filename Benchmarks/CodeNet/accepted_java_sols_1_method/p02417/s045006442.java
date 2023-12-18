import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        int num = 'a';
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] cha = str.toCharArray();
            for(char alp:cha){
                if(!Character.isAlphabetic(alp)){
                    continue;
                }
                alp = Character.toLowerCase(alp);
                count[alp-num]++;
            }
        }
        for(int i = 0; i < count.length; i++){
            System.out.print(Character.toChars(num+i));
            System.out.println(" : "+count[i]);
        }
    }
}