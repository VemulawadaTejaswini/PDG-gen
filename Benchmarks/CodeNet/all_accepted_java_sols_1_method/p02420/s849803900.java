import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        String s1, s2;
        int m, h, counter = 0;
        while(true){
            array[counter] = scanner.next();
            if(array[counter].equals("-"))break;
            m = scanner.nextInt();
            h = 0;
            for(int i = 0; i < m; i++){
                h += scanner.nextInt();
            }
            h %= array[counter].length();
            s1 = array[counter].substring(0, h);
            s2 = array[counter].substring(h);
            array[counter++] = s2 + s1;
        }
        for(int i = 0; i < counter; i++){
            System.out.println(array[i]);
        }
    }
}

