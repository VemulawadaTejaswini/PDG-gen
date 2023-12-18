partition(int[] array, int p, int r) {
	int pivot = array[r];
	int i = p - 1;
	int j = p;
	
	while (j < r) {
		if (i < j) {
			i++;
			swap(array, i, j);
		}
	}
	swap(array, i, r);

	return i++;
}

void swap(int[] array, int i, int j) {
	int tmp = array[j];
	array[j] = array[i]
	array[i] = tmp;
}