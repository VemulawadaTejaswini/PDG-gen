import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s;
        int[] counter = new int[26];
        char temp;
        while(scanner.hasNext()){
        s = scanner.nextLine();
        for(int i = 0; i < s.length(); i++){
            temp = s.charAt(i);
            if(temp >= 'A' && temp <= 'Z'){
                int index = temp - 'A';
                counter[index]++;
            }
            else if(temp >= 'a' && temp <= 'z'){
                int index = temp - 'a';
                counter[index]++;
            }
        }
        }
        for(int i = 0; i < 26; i++){
            System.out.println((char)(i+'a') + " : "+ counter[i]);
        }

    }
}

