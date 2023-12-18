import java.util.*;


class Student {

    private int number;
    private double weight;
    private double height;
    private double bmi;

    Student(int number, double weight, double height) {
        this.number = number;
        this.weight = weight;
        this.height = height;
        this.bmi = weight / (height * height);
    }

    int getNumber() {
        return this.number;
    }

    double getBmi() {
        return this.bmi;
    }

}

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String [] line = sc.nextLine().split(",");
            Student s = new Student( Integer.parseInt(line[0]), Double.parseDouble(line[1]), Double.parseDouble(line[2]) );
            if (s.getBmi() >= 25) {
                System.out.println(s.getNumber());
            }
        }

    }
}