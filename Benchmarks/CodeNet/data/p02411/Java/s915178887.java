import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                Student s = new Student(sc.nextInt(), sc.nextInt(), sc.nextInt());
                System.out.println(s.judge());
            }
        } catch(Exception e) {

        }



    }

}

class Student {
    int m;
    int f;
    int r;

    Student(int m, int f, int r) throws Exception {
        if (m == -1 && f == -1 && r == -1) {
            throw new Exception();
        }
        this.m = m;
        this.f = f;
        this.r = r;
    }

    char judge() {
        if (m == -1 || f == -1) {
            return 'F';
        } else if (m + f >= 80) {
            return 'A';
        } else if (m + f >= 65) {
            return 'B';
        } else if (m + f >= 50) {
            return 'C';
        } else if (m + f >= 30) {
            if (r >= 50) {
                return 'C';
            }
            return 'D';
        } else {
            return 'F';
        }
    }
}
