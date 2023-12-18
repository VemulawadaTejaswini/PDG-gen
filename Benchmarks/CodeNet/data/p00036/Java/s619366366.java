import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			while (true) {
				String line[] = new String[9];
				char c = 'A';
				int mem[] = new int[2];
				int j = 0;
				while ((line[j] = br.readLine())!=null) {
					if (line[j].equals("")) break;
					j++; 
				}
			
				for (int i=0;i<8;i++) {
					if (line[i].indexOf("1111")!=-1) {
						c = 'C';
						break;
					} else if ((mem[0] = line[i].indexOf("11"))!=-1) {
						mem[1] = line[i+1].indexOf("11");
						if (mem[0]==mem[1])	{
							c = 'A';
							break;
						} else if (mem[0]+1==mem[1]) {
							c = 'E';
							break;
						} else if (mem[0]-1==mem[1]) {
							c = 'G';
							break;
						}
					} else if ((mem[0] = line[i].indexOf("1"))!=-1) {
						mem[1] = line[i+1].indexOf("11");
						if (mem[0]==mem[1]) {
							c = 'F';
							break;
						} else if (mem[0]-1==mem[1]) {
							c = 'D';
							break;
						} else {
							c = 'B';
							break;
						}
					}
				}
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}