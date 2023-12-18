import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] str1 = new String[num];
        String[] str2 = new String[num];
        for(int i = 0;i < num;i++){
            String s = sc.next();
            str1[i] = s;
            str2[i] = s;
        }
        //バブルソート
        for(int i = 1;i < num;i++){
            for(int j = num - 1;j >= i;j--){
                if(str1[j].charAt(1) < str1[j - 1].charAt(1)){
                    String tmp = str1[j];
                    str1[j] = str1[j - 1];
                    str1[j - 1] = tmp;
                }
            }
        }
        //選択ソート
        for(int i = 0;i < num;i++){
            int min = i;
            for(int j = i + 1;j < num;j++){
                if(str2[min].charAt(1) > str2[j].charAt(1)){
                    min = j;
                }
            }
            String tmp = str2[i];
            str2[i] = str2[min];
            str2[min] = tmp;
        }
        //バブルソート後表示
        for(int i = 0;i < num;i++){
            if(i != 0)  System.out.print(" ");
            System.out.print(str1[i]);
        }
        System.out.println();

        System.out.println("Stable");

        //選択ソート後表示
        for(int i = 0;i < num;i++){
            if(i != 0)  System.out.print(" ");
            System.out.print(str2[i]);
        }
        System.out.println();

        int result = 1;
        for(int i = 0;i < str1.length;i++){
            if(!str1[i].equals(str2[i]))    result = 0;
        }
        if(result == 0) System.out.println("Not stable");
        else if(result == 1)    System.out.println("Stable");
    }
}
