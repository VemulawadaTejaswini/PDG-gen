import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Student> student = new ArrayList<Student>();
		//入力をリストに格納
		String buf;
		while((buf = br.readLine()) != null){
			String[] input = buf.split(",");
			student.add(new Student(Integer.parseInt(input[0]), Double.parseDouble(input[1]), Double.parseDouble(input[2])));
		}
		//肥満判定
		for(Student s : student){
			if(isFat(s)){
				System.out.println(s.id);
			}
		}
	}
	
	public static boolean isFat(Student student){
		boolean isFat = false;
		double bmi = student.weight / (student.height * student.height);
		if(bmi >= 25.0){
			isFat = true;
		}
		return isFat;
	}
}

class Student{
	int id;
	double weight;
	double height;
	Student(int id, double weight, double height){
		this.id = id;
		this.weight = weight;
		this.height = height;
	}
}