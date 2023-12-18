import java.util.Scanner;

class MyInteger {
    int value;

    MyInteger(int value){ //?????????????????????
        this.value = new Integer(value);
    }

    Integer getValue(){
        return value;
    }
}

class Main {
    static void swap(MyInteger a, MyInteger b){
        int tmp = a.value;

        a.value = b.value;
        b.value = tmp;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        MyInteger a = new MyInteger(Integer.parseInt(scan.next()));
        MyInteger b = new MyInteger(Integer.parseInt(scan.next()));
        MyInteger c = new MyInteger(Integer.parseInt(scan.next()));

        if (a.value > b.value)
            swap(a, b);
        if (b.value > c.value)
            swap(b, c);
        if (a.value > b.value)
            swap(a, b);
        
        System.out.println(a.value+ " " +b.value + " "+ c.value);
    }
}