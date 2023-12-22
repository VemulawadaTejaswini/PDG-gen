import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int i,num;
        int[] count = new int[26];
        for(i=0;i<26;i++) count[i] = 0;
        while(sc.hasNext()){
            str = sc.nextLine().replace(" ","");
            str = str.replace(".","");
            str = str.replace("\n","");
            str = str.toLowerCase();
            for(i=0;i<str.length();i++){
                if(str.charAt(i)-97>=0&&str.charAt(i)-97<26) count[(int)str.charAt(i)-97]++;
            }
        }
        for(i=0;i<26;i++){
            System.out.println((char)('a'+i) + " : " + count[i]);
        }
    }
}
