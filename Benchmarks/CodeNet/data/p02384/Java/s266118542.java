import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();

        for(int i=0;i<dice.getLength();i++){
            dice.setNumber(i, sc.nextInt());
        }
        sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            int top = sc.nextInt();
            int front = sc.nextInt();
            String patterm = "NESW";

            for(int j=0;j<6;j++){
                if(j!=0 && j!=5){
                    dice.roll(patterm.charAt(j-1));
                }
                if(j==5){
                    dice.roll(patterm.charAt(3));
                }
                if(dice.getNumber(0) == top){
                    break;
                }else if(j!=0 && j<4){
                    if(j<=2){
                        dice.roll(patterm.charAt(j-1+2));
                    }else{
                        dice.roll(patterm.charAt(j-1-2));
                    }
                }
            }
    
            for(int j=1;j<=4;j++){
                if(dice.getNumber(j)==front){
                    int x = 0;
                    switch (j){
                        case 1:
                            x = 2;
                            break;
                        case 2:
                            x = 4;
                            break;
                        case 4:
                            x = 3;
                            break;
                        case 3:
                            x = 1;
                            break;
                    }
                    System.out.println(dice.getNumber(x));
                }
            }
        }

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
    int getNumber(int i){
        return number[i];        
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
