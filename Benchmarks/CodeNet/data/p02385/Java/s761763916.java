import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        for(int i=0;i<dice1.getLength();i++){
            dice1.setNumber(i, sc.nextInt());
        }
        sc.nextLine();

        for(int i=0;i<dice2.getLength();i++){
            dice2.setNumber(i, sc.nextInt());
        }
        sc.nextLine();

        if(dice1.equals(dice2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        sc.close();
    }
}

class Dice{
    private int number[];
    private final String patterm = "NNNNWNNNWNNNENNNENNNWNNN";

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
    boolean equals(Dice another){
        boolean flag;

        for(int i=0;i<patterm.length();i++){
            roll(patterm.charAt(i));
            flag = true;
            for(int j=0;j<6;j++){
                if(this.number[j]!=another.number[j]){
                    flag = false;
                    break;
                }
            }
            if(flag)return true;
        }
        return false;
    }
}
