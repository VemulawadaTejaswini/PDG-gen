import java.util.Scanner;

class Main{
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String [] param_line = input.split(" ", 0);
        int [] dice_no = new int[6];
        for(int i=0; i<dice_no.length; i++)
            dice_no[i] = Integer.parseInt(param_line[i]);

        // create dice class instance
        Dice dice = new Dice(dice_no);

        System.out.println(dice);


        // dice operation
        input = in.nextLine();
        for(int i=0; i<input.length(); i++){
            switch(input.charAt(i)){
                case 'W':
                    dice.toW();
                    break;
                case 'E':
                    dice.toE();
                    break;
                case 'S':
                    dice.toS();
                    break;
                case 'N':
                    dice.toN();
                    break;
            }
            //System.out.println(dice);
            //System.out.println(input.charAt(i));
        }

        System.out.println(dice.get(0));

    }


}

class Dice{
    int [] page_no;
    int [] tmp;

    Dice(int [] a){
        page_no = a.clone();
        tmp = new int[page_no.length];
    }

    void toW(){
        // 3 2 6 1 5 4
        tmp[0] = page_no[2];
        tmp[1] = page_no[1];
        tmp[2] = page_no[5];
        tmp[3] = page_no[0];
        tmp[4] = page_no[4];
        tmp[5] = page_no[3];
        array_restore();
    }

    void toE(){
        // 4 2 1 6 5 3
        tmp[0] = page_no[3];
        tmp[1] = page_no[1];
        tmp[2] = page_no[0];
        tmp[3] = page_no[5];
        tmp[4] = page_no[4];
        tmp[5] = page_no[2];
        array_restore();
    }

    void toS(){
        // 5 1 3 4 6 2
        tmp[0] = page_no[4];
        tmp[1] = page_no[0];
        tmp[2] = page_no[2];
        tmp[3] = page_no[3];
        tmp[4] = page_no[5];
        tmp[5] = page_no[1];
        array_restore();
    }

    void toN(){
        // 2 6 3 4 1 5
        tmp[0] = page_no[1];
        tmp[1] = page_no[5];
        tmp[2] = page_no[2];
        tmp[3] = page_no[3];
        tmp[4] = page_no[0];
        tmp[5] = page_no[4];
        array_restore();
    }

    private void array_restore(){
        for(int i=0; i<page_no.length; i++)
            page_no[i] = tmp[i];
    }

    int get(int index){
        return page_no[index];
    }


    @Override
    public String toString(){
        String str = "";
        for(int i=0; i<page_no.length-1; i++)
            str += page_no[i] + ", ";
        str += page_no[page_no.length-1];
        return str;
    }
}