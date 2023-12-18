import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice();
        for(int i=0;i<dice.getLength();i++){
           dice.setNumber(i, sc.nextInt());
        }
        sc.nextLine();

        String direction = sc.next();
        sc.nextLine();

        for(int i=0;i<direction.length();i++){
            dice.roll(direction.charAt(i));
        }
        System.out.println(dice.getTop());
        sc.close();
    }
}
class Dice{
    int number[];

    Dice(){
        number = new int[6];
    }

    void setNumber(int x, int num){
        number[x] = num;
    }
    int getLength(){
        return number.length;
    }
    int getTop(){
        return number[0];
    }
    void printArray(int array[]){
        for(int i=0;i<array.length;i++)System.out.printf("%d ", array[i]);
        System.out.println();
    }
    void roll(char d){
        int array[] = new int[number.length];
        switch (d){
            case 'S':
                //roll
                array[0] = number[4];
                array[1] = number[0];
                array[5] = number[1];
                array[4] = number[5];
                //not roll
                array[2] = number[2];
                array[3] = number[3];
                break;
            case 'W':
                array[0] = number[2];
                array[3] = number[0];
                array[5] = number[3];
                array[2] = number[5];

                array[1] = number[1];
                array[4] = number[4];
                break;
            case 'N':
                array[0] = number[1];
                array[1] = number[5];
                array[5] = number[4];
                array[4] = number[0];

                array[2] = number[2];
                array[3] = number[3];
                break;
            case 'E':
                array[0] = number[3];
                array[3] = number[5];
                array[5] = number[2];
                array[2] = number[0];
                
                array[1] = number[1];
                array[4] = number[4];
                break;
        }
        for(int i=0;i<getLength();i++){
            setNumber(i, array[i]);
        }
    }
}
