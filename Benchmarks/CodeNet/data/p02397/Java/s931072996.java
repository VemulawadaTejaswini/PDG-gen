import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean state = true;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (state) {
            int input = scanner.nextInt();
            int input2 = scanner.nextInt();
            list.add(input); list.add(input2);
            if ( input == 0 && input2 == 0)  state = false;
        }

        int temp;

        for (int i=0;i<list.size()-2;i=i+2){
            if(list.get(i) > list.get(i+1)){
                //System.out.println("test: " + list.get(i) + " " + list.get(i+1));
                temp = list.get(i);
                list.set(i,list.get(i+1));
                list.set(i+1, temp);
            }
            System.out.println(list.get(i) + " " + list.get(i+1));
        }

    }
}
